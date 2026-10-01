package mx.uv.fei.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludarControlador {
	String nombre;
    
    @GetMapping("/saludos")
	public String saludar(){
		return "Hola Dana! 🫵😋 " + nombre;
	}

    @GetMapping("/despedidas")
	public String despedirse(){
		return "Adiós Dana! ✌️😋";
	}

	@PostMapping("/nombramientos")
	public void nombre(){
		nombre = "De pepis 😎";
	}

	@PutMapping("/nombramientos")
	public void cambiar(){
		nombre = "actualizar 🔄️";
	} 

	@DeleteMapping("/nombramientos")
	public void eliminar(){
		nombre = null + "🗑️😪";
	}
}
