package comparator;

import modle.Service;

import java.util.Comparator;

public class ComparatorByIdService implements Comparator<Service> {
    @Override
    public int compare(Service o1, Service o2) {
        return o1.getId()-o2.getId();
    }
}
