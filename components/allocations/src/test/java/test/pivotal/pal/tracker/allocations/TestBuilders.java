package test.pivotal.pal.tracker.allocations;

import io.pivotal.pal.tracker.eurekaserver.AllocationForm;
import io.pivotal.pal.tracker.eurekaserver.AllocationInfo;
import io.pivotal.pal.tracker.eurekaserver.data.AllocationFields;
import io.pivotal.pal.tracker.eurekaserver.data.AllocationRecord;

import java.time.LocalDate;

import static io.pivotal.pal.tracker.eurekaserver.AllocationForm.allocationFormBuilder;
import static io.pivotal.pal.tracker.eurekaserver.AllocationInfo.allocationInfoBuilder;
import static io.pivotal.pal.tracker.eurekaserver.data.AllocationFields.allocationFieldsBuilder;
import static io.pivotal.pal.tracker.eurekaserver.data.AllocationRecord.allocationRecordBuilder;

public class TestBuilders {

    public static AllocationRecord.Builder testAllocationRecordBuilder() {
        return allocationRecordBuilder()
            .id(12L)
            .projectId(13L)
            .userId(14L)
            .firstDay(LocalDate.parse("2016-02-22"))
            .lastDay(LocalDate.parse("2017-02-23"));
    }

    public static AllocationFields.Builder testAllocationFieldsBuilder() {
        return allocationFieldsBuilder()
            .projectId(13L)
            .userId(14L)
            .firstDay(LocalDate.parse("2016-02-22"))
            .lastDay(LocalDate.parse("2017-02-23"));
    }

    public static AllocationForm.Builder testAllocationFormBuilder() {
        return allocationFormBuilder()
            .projectId(13L)
            .userId(14L)
            .firstDay("2016-02-22")
            .lastDay("2017-02-23");
    }

    public static AllocationInfo.Builder testAllocationInfoBuilder() {
        return allocationInfoBuilder()
            .id(12L)
            .projectId(13L)
            .userId(14L)
            .firstDay("2016-02-22")
            .lastDay("2017-02-23")
            .info("allocation info");
    }
}
