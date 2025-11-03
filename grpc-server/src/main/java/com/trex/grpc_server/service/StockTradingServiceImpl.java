package com.trex.grpc_server.service;

import com.trex.grpc.StockRequest;
import com.trex.grpc.StockResponse;
import com.trex.grpc.StockTradingServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.springframework.grpc.server.service.GrpcService;

@GrpcService
public class StockTradingServiceImpl extends StockTradingServiceGrpc.StockTradingServiceImplBase {

    @Override
    public void getStockPrice(StockRequest request, StreamObserver<StockResponse> responseObserver) {
        super.getStockPrice(request, responseObserver);
    }
}
