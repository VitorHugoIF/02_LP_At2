/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.Model;

import factory.Service.PacServiceFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vitor.marcelino
 */
public class PacTest {
    
    /**
     * Test of deliver method, of class Pac.
     */
    @Test
    public void testDeliver() {
        IDeliveryService service = new PacServiceFactory().getService();
        assertEquals("Entregue via PAC", service.deliver());
    }

    /**
     * Test of cancelDelivery method, of class Pac.
     */
    @Test
    public void testCancelDelivery() {
        IDeliveryService service = new PacServiceFactory().getService();
        assertEquals("Entrega via PAC cancelada", service.cancelDelivery());
    }
}
