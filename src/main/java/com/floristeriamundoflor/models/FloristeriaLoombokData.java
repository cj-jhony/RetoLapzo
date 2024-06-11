package com.floristeriamundoflor.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FloristeriaLoombokData {




    private String ventana;
    private String producto;
    private String producto2;

    public String getVentana() {
        return ventana;
    }

    public String getProducto() {
        return producto;
    }

    public String getProducto2() {
        return producto2;
    }



    public static List<FloristeriaLoombokData> setData(DataTable dataTable) {
        List<FloristeriaLoombokData> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, FloristeriaLoombokData.class));
        }
        return dates;
    }
}
