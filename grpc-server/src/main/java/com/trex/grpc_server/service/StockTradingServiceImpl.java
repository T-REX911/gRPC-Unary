package com.trex.grpc_server.service;

import com.trex.grpc.StockRequest;
import com.trex.grpc.StockResponse;
import com.trex.grpc.StockTradingServiceGrpc;
import com.trex.grpc_server.entity.Stock;
import com.trex.grpc_server.repository.StockRepository;
import io.grpc.stub.StreamObserver;
import org.springframework.grpc.server.service.GrpcService;

@GrpcService
public class StockTradingServiceImpl extends StockTradingServiceGrpc.StockTradingServiceImplBase {

    private StockRepository stockRepository;


    @Override
    public void getStockPrice(StockRequest request, StreamObserver<StockResponse> responseObserver) {
        String stockSymbol = request.getStockSymbol();
        Stock stockEntity = stockRepository.findByStockSymbol(stockSymbol);
    }
}
