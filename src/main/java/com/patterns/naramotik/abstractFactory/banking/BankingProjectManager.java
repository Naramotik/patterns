package com.patterns.naramotik.abstractFactory.banking;

import com.patterns.naramotik.abstractFactory.ProjectManager;

public class BankingProjectManager implements ProjectManager {
    @Override
    public void startManage() {
        System.out.println("Im managing");
    }
}
