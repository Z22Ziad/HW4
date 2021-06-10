package com.company;

public class Admin {
    Admin() {}
    public void verifyAPlayground (Playground p) {
        p.setApproved(true);
    }
    public void suspendAPlayground (Playground p) {
        p.setValid(false);
    }
    public void deleteAPlayground (Playground p) {
        p.setDeleted(true);
    }

}
