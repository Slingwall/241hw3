
public enum Generation {
    Nemo,
    II,
    III,
    IV,
    V,
    VI,
    VII,
    VIII,
    IX,
    X;

    public static Generation toGeneration(String s) {
        switch (s) {
            case "II":
                return Generation.II;

            case "III":
                return Generation.III;

            case "IV":
                return Generation.IV;

            case "V":
                return Generation.V;

            case "VI":
                return Generation.VI;

            case "VII":
                return Generation.VII;

            case "VIII":
                return Generation.VIII;

            case "IX":
                return Generation.IX;

            case "X":
                return Generation.X;

            default:
                return Generation.Nemo;
        }
    }
}
