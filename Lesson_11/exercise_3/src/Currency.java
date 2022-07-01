public enum Currency {
    USD("— United States dollar"),EUR("— Euro"),GBP("— Pound sterling"),
    RUB("- Russian ruble"),UAH("— Ukrainian hryvnia"),KZT("— Kazakhstani tenge"),
    CAD("— Canadian dollar"),JPY("— Japanese yen"),CNY("— Chinese yuan");
    private final String addInfo;
    Currency(String addInfo){
        this.addInfo = addInfo;
    }
    public String getAddInfo(){
        return addInfo;
    }
}
