package www.guoxin.com.weather.model;

/**
 * Created by Administrator on 2016/10/26 0026.
 * Province的实体类，方便对Province的操作
 */

public class Province {
    private int id;
    private String provinceName;
    private String ProvinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceCode() {
        return ProvinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        ProvinceCode = provinceCode;
    }
}
