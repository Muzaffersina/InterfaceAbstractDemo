import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPersonCheckService{
	private boolean durum=true;
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {			
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNatioanalityID()),customer.getFirstName(),customer.getLastName(),customer.getBirth());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			durum = false;
		}
		return durum;
	}

}
