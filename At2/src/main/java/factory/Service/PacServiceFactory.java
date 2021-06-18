/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.Service;

import factory.Model.IDeliveryService;
import factory.Model.Pac;

/**
 *
 * @author vitor.marcelino
 */
public class PacServiceFactory implements IServiceFactory {

    @Override
    public IDeliveryService getService() {
        return new Pac();
    }
}
