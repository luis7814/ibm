package co.com.ibm.asesor;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import co.com.ibm.asesor.core.shared.services.AsesorService;
import co.com.ibm.asesor.repository.commons.dao.IAsesorDao;
import co.com.ibm.asesor.repository.commons.entities.IbmAsesor;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class AsesorBancarioApplicationTests {

	@InjectMocks
	private AsesorService asesorService;
	
	@Mock
	private IAsesorDao iAsesorDao;
	
	/*
	 * Se realiza test para servicio de listarAsesores();
	 */
	@Test
	public void contextLoads() {
		
		TestCase testCase = new TestCase();
		List<IbmAsesor> ibmAsesors;
		
		try {
			
			for(int a = 0; a < 2; a++) {
				
				if(a == 0) {
					ibmAsesors = testCase.datosPrueba();
					when(iAsesorDao.listarAsesores()).thenReturn(ibmAsesors);
					assertEquals(3,asesorService.listarAsesores().size());
				}
				
				if(a == 1) {
					ibmAsesors = null;
					when(iAsesorDao.listarAsesores()).thenReturn(ibmAsesors);
					assertEquals("Lista vacia!.", asesorService.listarAsesores().get(0).getMensajeResultado());
				}
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
