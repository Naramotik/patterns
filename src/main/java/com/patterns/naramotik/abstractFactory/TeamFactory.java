package com.patterns.naramotik.abstractFactory;

public interface TeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
