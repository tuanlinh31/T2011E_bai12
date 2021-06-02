package Bai12.entity;

import Bai12.logic.IElectricity;

public class FGperson extends Person implements IElectricity {


    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getNationalid() {
        return nationalid;
    }

    public void setNationalid(String nationalid) {
        this.nationalid = nationalid;
    }

    @Override
    public float invoice() {
        int count = 0;
        int sum =0;
        float thanhtien = 0;
        for(int i = 0;i<arr.size();i++){
            Person p = arr.get(i);
            if(p.nation != null){
                Person ps = arr.get(kw);

                count++;
            }

        }
        if(count <=quota){
            thanhtien = price*count;
        }
        else {
            thanhtien = price*quota+ (kw - quota)*price*1.5F;
        }
        System.out.println("So tien: " +thanhtien);
        return thanhtien;
    }

    @Override
    public void pay() {

    }


    @Override
    public void insertKH(int id, String name, String date, String type, int kw, String phone, int wallet, String nation, String nationalid) {
        boolean trung = false;
        for(int i = 0; i<arr.size();i++){
            Person p = arr.get(i);
            if(p.id == id){
                trung = true;
                break;
            }
        }
        if(!trung){
            Person p = new VNperson();
            p.id = id;
            p.name = name;
            p.date = date;
            p.type = type;
            p.kw = kw;
            p.phone = phone;
            p.wallet = wallet;
            p.nation = nation;
            p.nationalid = nationalid;
        }
    }


    @Override
    public void retrievePhoneNumber() {

    }
}
