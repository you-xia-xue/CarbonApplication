package com.carbon.carbon.DAO;

import com.carbon.carbon.pojo.SaleData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SalesDataRepository extends JpaRepository<SaleData,Integer> {
    @Query("SELECT SUM(e.totalSales)FROM SaleData e WHERE YEAR(e.date) = YEAR(NOW())")
    Integer sumSalesByYear();
    @Query("SELECT SUM(e.totalSales)FROM SaleData e WHERE MONTH(e.date) = MONTH(NOW())")
    Integer sumSalesByMonth();
    @Query("SELECT SUM(e.totalSales)FROM SaleData e WHERE DAY(e.date) = DAY(NOW())")
    Integer sumSalesByDay();

    List<SaleData> findFirst8ByOrderByTotalSalesDesc();
}
