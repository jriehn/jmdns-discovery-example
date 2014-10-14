/**
 * Created by jriehn on 14/10/2014.
 */

import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

/**
 * Created by jriehn on 14/10/2014.
 */
public class SampleListener implements ServiceListener {

    @Override
    public void serviceAdded(ServiceEvent event) {
        System.out.println("Service added   : " + event.getName() + "." + event.getType()+":"+event.getInfo().getPort());
    }

    @Override
    public void serviceRemoved(ServiceEvent event) {
        System.out.println("Service removed : " + event.getName() + "." + event.getType());
    }

    @Override
    public void serviceResolved(ServiceEvent event) {
        System.out.println("Service resolved: " + event.getInfo());
    }
}