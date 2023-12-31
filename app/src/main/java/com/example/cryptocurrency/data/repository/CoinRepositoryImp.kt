package com.example.cryptocurrency.data.repository

import com.example.cryptocurrency.data.dto.CoinDetailDto
import com.example.cryptocurrency.data.dto.CoinDto
import com.example.cryptocurrency.data.remote.CoinPaprikaApi
import com.example.cryptocurrency.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImp @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}