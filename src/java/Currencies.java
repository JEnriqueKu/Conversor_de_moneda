import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Currencies {

    /*@SerializedName("conversion_rates")
    private Object[] conversionRates;*/

    @SerializedName("MXN")
    private double mxn;

    @SerializedName("ARS")
    private double ars;

    @SerializedName("BOB")
    private double bob;

    @SerializedName("BRL")
    private double brl;

    @SerializedName("COP")
    private double cop;

    @SerializedName("CLP")
    private double clp;

}
