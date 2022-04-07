package day31_Constructions;
import java.util.ArrayList;
import java.util.Arrays;
public class MyOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        offer1.setInfo("VA", "Amazon Inc", "SDET", 190000, true, true, true, true);
        Offer offer2 = new Offer();
        offer2.setInfo("CA", "Sony Inc", "QA", 120000, true, false, false, true);
        Offer offer3 = new Offer();
        offer3.setInfo("FL", "Apple Inc", "QE", 25000, true, true, true, false);
        Offer offer4 = new Offer();
        offer4.setInfo("TX", "CapitalOne", "SM", 115000, false, false, true, true);
        Offer offer5 = new Offer();
        offer5.setInfo("WA", "Bank of Amareca", "BA", 130000, true, true, false, true);
        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);
        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5};
        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p -> !p.isFullTime);
        System.out.println(fullTimeOffers.size());
        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p -> !p.location.equals("VA"));
        System.out.println(localOffers.size());
        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p -> (p.hasBenefit && p.hasPTO));
        System.out.println(offersWithBenefits.size());
        System.out.println(offersWithBenefits);
        ArrayList<Offer> sdetOffers = new ArrayList<>(Arrays.asList(myOffers));
        sdetOffers.removeIf(p -> !p.jobTitle.equals("SDET"));
        System.out.println(sdetOffers);

        ArrayList<Offer>offersWith100K=new ArrayList<>(Arrays.asList(myOffers));
        offersWith100K.removeIf(p-> p.salary<100000);
        System.out.println(offersWith100K.size());
        System.out.println(offersWith100K);

    }
}
