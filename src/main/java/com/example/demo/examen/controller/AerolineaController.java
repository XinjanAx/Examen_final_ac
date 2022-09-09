package com.example.demo.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.examen.modelo.BuscarVueloTo;
import com.example.demo.examen.modelo.VentaVuelosDisponible;
import com.example.demo.examen.modelo.VuelosDisponiblesTo;
import com.example.demo.examen.service.IVueloService;

@Controller
@RequestMapping("/aerolinea")
public class AerolineaController {
	
	@Autowired
	private IVueloService vueloService;
	
	@GetMapping("/buscar_vuelo")
	public String buscarVuelo(BuscarVueloTo vueloB ) {
		return "vistaBuscarVuelo";
	}
	
	@PostMapping("/buscar")
	public String buscar(BuscarVueloTo vueloB, Model modelo) {
		List<VuelosDisponiblesTo> lista = this.vueloService.vuelosDis(vueloB);
		modelo.addAttribute("vuelosDisponibles",lista);
		return "vistaVuleosDisponibles";
	}
	
	@GetMapping("/recervar_vuelo")
	public String reservarVuelo(VentaVuelosDisponible ventaV ) {
		return "vistaReservarVuelo";
	}
	@PostMapping("/reservar")
	public String reservar(VentaVuelosDisponible vueloV, Model modelo) {
		//buscar en la base los buelos con el ventaVuelosD
		return "vistaVuleosDisponibles";
	}
	
}