public class TipCalc {

    private double bill;
    private int people;
    private double tipPercent;
    private double billTip;
    private double Tip;
    private double tipSplit;

    public TipCalc (double bill,double tipPercent, int people){
        this.bill = bill;
        this.tipPercent = tipPercent;
        this.people = people;
    }

    public String TipCalculated() {
        this.tipPercent = (tipPercent * .01);
        this.Tip = (bill * tipPercent);
        this.billTip = bill + Tip;
        this.tipSplit = (Tip/people);
        return "The tip would be " + Tip + ", the tip split would be " + tipSplit + ", making the total now " + billTip + ", which is" + (billTip / people) + " per person.";
    }
    public double getTipPercent() {
        this.tipPercent = (tipPercent * .01);
        return tipPercent;
    }






}
