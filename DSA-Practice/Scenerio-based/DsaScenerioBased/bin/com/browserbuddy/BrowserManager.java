package com.browserbuddy;
import java.util.Stack;

public class BrowserManager {

	private BrowserTab currentTab;
    private Stack<BrowserTab> closedTabs;

    public BrowserManager() {
        currentTab = new BrowserTab();
        closedTabs = new Stack<>();
    }

    public BrowserTab getCurrentTab() {
        return currentTab;
    }

    // Close current tab
    public void closeTab() {
        closedTabs.push(currentTab);
        currentTab = new BrowserTab();
        System.out.println("Tab closed.");
    }

    // Restore last closed tab
    public void restoreTab() {
        if (!closedTabs.isEmpty()) {
            currentTab = closedTabs.pop();
            System.out.println("Tab restored. Current page: " +
                    currentTab.getCurrentPage());
        } else {
            System.out.println("No closed tabs to restore.");
        }
    }
}