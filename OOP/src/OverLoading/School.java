package OverLoading;

public class School {
    private String code;
    public void  setCode(String code){
     this.code=code;
    }
    public void setCode(){
     this.code="SV100";
    }

    public void setCode(int number){
        this.code="SV"+number;

    }
    public void setCode(String str,int number){
        this.code=str+number;
    }
    public String getCode(){
        return code;
    }
}
