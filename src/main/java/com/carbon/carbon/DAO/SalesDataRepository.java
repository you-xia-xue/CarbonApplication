package com.carbon.carbon.DAO;

import com.carbon.carbon.pojo.SaleData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SalesDataRepository extends JpaRepository<SaleData,Integer> {
    @Query("SELECT SUM(total_sales)FROM sales_data WHERE YEAR(NOW())")
    Integer sumSalesByYear();
    @Query("SELECT SUM(total_sales)FROM sales_data WHERE MONTH(NOW())")
    Integer sumSalesByMonth();
    @Query("SELECT SUM(total_sales)FROM sales_data WHERE DAY(NOW())")
    Integer sumSalesByDay();

    List<SaleData> findFirst8ByOrderByTotalSalesDesc();
}
