package com.teamdevsolution.app.service.impl;

import com.teamdevsolution.app.domain.Data;
import com.teamdevsolution.app.repository.DataRepository;
import com.teamdevsolution.app.service.DataService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {

    private final DataRepository dataRepository;

    public DataServiceImpl(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Data> getAllDatas() {
        return dataRepository.findAll();
    }

    @Override
    @Transactional
    public Data saveData(Data data) {
        return dataRepository.save(data);
    }
}
