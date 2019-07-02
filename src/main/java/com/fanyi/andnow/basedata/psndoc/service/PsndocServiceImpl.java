package com.fanyi.andnow.basedata.psndoc.service;

import com.fanyi.andnow.basedata.psndoc.mapper.PsndocMapper;
import com.fanyi.andnow.common.vo.basedata.Psndoc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PsndocServiceImpl implements PsndocService{

    @Autowired
    private PsndocMapper psndocMapper;

    @Override
    public List<Psndoc> getPsndocList() {
        return psndocMapper.selectPsndocList();
    }

    @Override
    public int addPsndoc(Psndoc psndoc) {
        return psndocMapper.insertPsndc(psndoc);
    }

    @Override
    public int savePsndoc(Psndoc psndoc) {
        return psndocMapper.updateByPsndoc(psndoc);
    }

    @Override
    public Psndoc getPsndocOne(Integer pk) {
        return psndocMapper.selectByPrimaryKey(pk);
    }

    @Override
    public int removePsndoc(Integer pk) {
        return psndocMapper.deletePsndocByPrimaryKey(pk);
    }

    @Override
    public int getPsndocCount() {
        return psndocMapper.selectPsndocCount();
    }
}
