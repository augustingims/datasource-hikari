package com.teamdevsolution.app.service;

import com.teamdevsolution.app.domain.Data;

import java.util.List;

public interface DataService {

    List<Data> getAllDatas();

    Data saveData(Data data);
}
