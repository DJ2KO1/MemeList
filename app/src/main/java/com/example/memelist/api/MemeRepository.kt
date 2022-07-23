package com.example.memelist.api

import com.example.memelist.model.UIState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

interface MemeRepository {
    suspend fun getMemesByPageNum(num: Int): Flow<UIState>
    suspend fun getMemeByID(id: Int): Flow<UIState>
}

class MemeRepositoryImp(private val service: MemeService): MemeRepository{
    override suspend fun getMemesByPageNum(num: Int): Flow<UIState>  =
        flow {
            try {
                val response = service.getMemesByPageNum(num)
                if (response.isSuccessful){
                    emit(response.body()?.let {
                        UIState.Success(it)
                    } ?: throw Exception("Empty Response"))
                } else throw Exception("Failed Network Call")
            }catch (e: Exception){
                emit(UIState.Error(e))
            }
        }

    override suspend fun getMemeByID(id: Int): Flow<UIState>  =
        flow {
            try {
                val response = service.getMemeByID(id)
                if (response.isSuccessful){
                    emit(response.body()?.let {
                        UIState.Success(it)
                    } ?: throw Exception("Empty Response"))
                } else throw Exception("Failed Network Call")
            }catch (e: Exception){
                emit(UIState.Error(e))
            }
        }

}