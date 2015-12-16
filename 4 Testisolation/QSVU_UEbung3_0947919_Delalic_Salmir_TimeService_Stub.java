import java.util.Date;

public class QSVU_UEbung3_0947919_Delalic_Salmir_TimeService_Stub implements TimeService {


    @Override
    public Date getCurrentDate() {
        return new Date(2015, 12, 10);
    }

    @Override
    public long daysBetween(Date dateFrom, Date dateTo) {
        return 10L;
    }
}