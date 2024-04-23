public class Moneda {

    private String base_code;
    private String target_code;
    private String conversion_result;

    public String getBase_code() {
        return base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public String getConversion_result() {
        return conversion_result;
    }

    @Override
    public String toString() {
        return " [" +  base_code +  "] " + "Corresponde al valor final de =>> " +
                conversion_result + " [" + target_code + "]";
    }
}
