/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.Model;

import factory.Service.SedexServiceFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vitor.marcelino
 */
public class SedexTest {
    /**
     * Test of deliver method, of class Sedex.
     */
    @Test
    public void testDeliver() {
        IDeliveryService service = new SedexServiceFactory().getService();
        assertEquals("Entregue via Sedex", service.deliver());
    }

    /**
     * Test of cancelDelivery method, of class Sedex.
     */
    @Test
    public void testCancelDelivery() {
        IDeliveryService service = new SedexServiceFactory().getService();
        assertEquals("Entrega via Sedex cancelada", service.cancelDelivery());
    }
}
