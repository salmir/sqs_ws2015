import java.util.Date;

public class QSVU_UEbung3_0947919_Delalic_Salmir_TimeService_Mock implements TimeService{

    @Override
    public Date getCurrentDate() {
        return new Date();
    }

    @Override
    public long daysBetween(Date dateFrom, Date dateTo) {
        if ((dateFrom == null) || (dateTo == null)) throw new IllegalArgumentException("date mustn't be null");
        if (dateFrom.after(dateTo)) throw new IllegalArgumentException("fromDate mustn't be after toDate");
        return 10L;
    }
}