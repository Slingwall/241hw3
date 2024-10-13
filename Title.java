public enum Title {
    Caesar,
    Regina,
    Magnaducissa,
    Archiducissa,
    Ducissa,
    Principissa,
    Proregina,
    Marchionissa,
    Comitissa,
    Vicecomitissa,
    Baronissa,
    Eques,
    NobilisHomo,
    Nemo;

    public static Title toTitle(String s) {
        switch (s) {
            case "Caesar":
                return Title.Caesar;

            case "Regina":
                return Title.Regina;

            case "MagnaDucissa":
                return Title.Magnaducissa;

            case "ArchiDucissa":
                return Title.Archiducissa;

            case "Ducissa":
                return Title.Ducissa;

            case "Principissa":
                return Title.Principissa;

            case "Proregina":
                return Title.Proregina;

            case "Marchionissa":
                return Title.Marchionissa;

            case "Comitissa":
                return Title.Comitissa;

            case "ViceComitissa":
                return Title.Vicecomitissa;

            case "Baronissa":
                return Title.Baronissa;

            case "Eques":
                return Title.Eques;

            case "NobilisHomo":
                return Title.NobilisHomo;

            default:
                return Title.Nemo;
        }
    }
}
