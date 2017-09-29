package com.example.proyectoBullying;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Centro;
import com.example.model.Experiencia;
import com.example.model.Positivo;

@Controller
public class BullyingController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/inicio")
	static public String inicio(Model template) throws SQLException {
		
		return "inicio";
	}

	@RequestMapping("/padres")
	static public String padres(Model template) throws SQLException {
		
		return "padres";
	}
	
	@RequestMapping("/escuela")
	static public String escuela(Model template) throws SQLException {
		
		return "escuela";
	}

	@GetMapping("/experiencias")
	static public String experiencias(Model template) throws SQLException {
		
		Connection connection;
		connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyecto_comit", "postgres", "admin");
		
		PreparedStatement ps = connection.prepareStatement(
				  "SELECT id, usuario, avatar, comentario FROM experiencias");
		
		ResultSet result = ps.executeQuery();
		
				
				
		ArrayList<Experiencia> listaExperiencias;
		listaExperiencias = new ArrayList<Experiencia>();
				
		
		
		while ( result.next() ) {
			Experiencia e = new Experiencia(
					
					result.getString( "usuario" ), 
					result.getString( "avatar" ),  
					result.getString( "comentario" ), 
					result.getInt("id"));
					
				
			listaExperiencias.add(e);
			
		}
		template.addAttribute( "experiencias", listaExperiencias );
		
		connection.close();
		
		
		return "experiencias";
	}
	
	@PostMapping("/experiencias")
	static public String recepcion(Model template, @RequestParam String usuario, @RequestParam String avatar, @RequestParam String comentario) throws SQLException {
		
		Connection connection;
		connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyecto_comit", "postgres", "admin");
		
		
		
			
				
		PreparedStatement ps2 = connection.prepareStatement(
				"INSERT INTO experiencias(usuario, avatar, comentario)"
						+ "VALUES(?,?,?)");
						
		ps2.setString(1, usuario); 
		ps2.setString(2, avatar);
		ps2.setString(3, comentario);
		
		
		if (usuario.equals("")|| avatar.equals("")|| comentario.equals(""))	{
			template.addAttribute("usuario", usuario); //Para no volver a tipear nombre y que me lo recuerde al volver a rellenar formulario.
			template.addAttribute("avatar", avatar);
			template.addAttribute("comentario", comentario);
			template.addAttribute("error", "Falta completar datos");
			return "experiencias";
		}
		
					
		
		ps2.executeUpdate();
		
		
		PreparedStatement ps = connection.prepareStatement(
				  "SELECT id, usuario, avatar, comentario FROM experiencias");
		
		ResultSet result = ps.executeQuery();
		
				
				
		ArrayList<Experiencia> listaExperiencias;
		listaExperiencias = new ArrayList<Experiencia>();
				
		
		
		while ( result.next() ) {
			Experiencia e = new Experiencia(
					
					result.getString( "usuario" ), 
					result.getString( "avatar" ),  
					result.getString( "comentario" ), 
					result.getInt("id"));
					
				
			listaExperiencias.add(e);
			
		}
		template.addAttribute( "experiencias", listaExperiencias );
		
		if(!(avatar.equals(""))) {
			template.addAttribute("imagen_subida", "La imagen se subió correctamente");
			return "experiencias";
		}
		connection.close();
		
		return "experiencias";
	}
	
	
	@GetMapping("/pensamientos_positivos")
	static public String pensamientosPositivos(Model template) throws SQLException {
		
		Connection connection;
		connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyecto_comit", "postgres", "admin");
		
		
		PreparedStatement ps = connection.prepareStatement(
				  "SELECT id, usuario, imagen FROM pensamientospositivos");
		
		ResultSet result = ps.executeQuery();
		
				
				
		ArrayList<Positivo> listaPositivos;
		listaPositivos= new ArrayList<Positivo>();
		
			
				
		while ( result.next() ) {
			Positivo p = new Positivo(
					
					result.getString( "usuario" ), 
					result.getString( "imagen" ),  
					result.getInt("id"));
					
				
			listaPositivos.add(p);
		}
		
		template.addAttribute( "pensamientos", listaPositivos );
		
		
		
		return "pensamientos_positivos";
	}
	
	@PostMapping("/pensamientos_positivos")
	static public String agregar(Model template, @RequestParam String usuario, @RequestParam String imagen) throws SQLException {
		
		Connection connection;
		connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyecto_comit", "postgres", "admin");
		
		
		PreparedStatement ps2 = connection.prepareStatement(
				"INSERT INTO pensamientospositivos(usuario, imagen)"
						+ "VALUES(?,?)");
						
		ps2.setString(1, usuario); 
		ps2.setString(2, imagen);
		
		
	
		
		if (usuario.equals("")|| imagen.equals(""))	{
			template.addAttribute("usuario", usuario); 
			template.addAttribute("imagen", imagen);
			template.addAttribute("error", "Falta completar datos");
			return "pensamientos_positivos";
		}
		
			
	
		ps2.executeUpdate();
		
		
		PreparedStatement ps = connection.prepareStatement(
				  "SELECT id, usuario, imagen FROM pensamientospositivos");
		
		ResultSet result = ps.executeQuery();
		
				
				
		ArrayList<Positivo> listaPositivos;
		listaPositivos= new ArrayList<Positivo>();
		
			
				
		while ( result.next() ) {
			Positivo p = new Positivo(
					
					result.getString( "usuario" ), 
					result.getString( "imagen" ),  
					result.getInt("id"));
					
				
			listaPositivos.add(p);
		}
		
		template.addAttribute( "pensamientos", listaPositivos );
		
				
		if(!(imagen.equals(""))) {
			template.addAttribute("imagen_subida", "La imagen se subió correctamente");
			return "pensamientos_positivos";
		}
		
		connection.close();
		
		return "pensamientos_positivos";
	}
	
	
	@GetMapping("/centros")
	static public String centrosget(Model template) throws SQLException {
		
		Connection connection;
		connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyecto_comit", "postgres", "admin");
		
		PreparedStatement ps = connection.prepareStatement(
				"SELECT id, nombre, descripcion, direccion FROM centros");
		
		ResultSet result = ps.executeQuery();
		 
		
		ArrayList<Centro> listaCentros;
		listaCentros= new ArrayList<Centro>();
					
				
		while ( result.next() ) {
			Centro c = new Centro(
					result.getInt("id"),
					result.getString( "nombre" ),
					result.getString( "descripcion" ), 
					result.getString( "direccion" ));
					
				
			listaCentros.add(c);
		}
		
		template.addAttribute( "centros", listaCentros );
		
		connection.close(); 
		
		return "centros";
	}
	
	@PostMapping("/centros")
	static public String centrospost(Model template, @RequestParam String nombre, @RequestParam String descripcion, @RequestParam String direccion, HttpServletRequest request) throws SQLException {
		
		Connection connection;
		connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyecto_comit", "postgres", "admin");
		
		
		PreparedStatement ps = connection.prepareStatement("INSERT INTO centros(nombre, descripcion, direccion)"
				+ "VALUES(?,?,?)");
		
		
		ps.setString(1, nombre);
		ps.setString(2, descripcion);
		ps.setString(3, direccion);
		
		if (nombre.equals("")|| descripcion.equals("") || direccion.equals(""))	{
			template.addAttribute("nombre", nombre); 
			template.addAttribute("descripcion", descripcion);
			template.addAttribute("direccion", direccion);
			template.addAttribute("error", "Falta completar datos");
			return "centros";
		}
					
		ps.executeUpdate();
		
		
		PreparedStatement ps2 = connection.prepareStatement(
				"SELECT id, nombre, descripcion, direccion FROM centros");
		
		ResultSet result = ps2.executeQuery();
		 
		
		ArrayList<Centro> listaCentros;
		listaCentros= new ArrayList<Centro>();
					
				
		while ( result.next() ) {
			Centro c = new Centro(
					result.getInt("id"),
					result.getString( "nombre" ),
					result.getString( "descripcion" ), 
					result.getString( "direccion" ));
					
				
			listaCentros.add(c);
		}
		
		int id= obtenerUsuario(request);
		if(id!=0) {
			template.addAttribute("logueado", true);
		}
		
		//Variable del tymeleaf ${centros}
		template.addAttribute( "centros", listaCentros );
		
		connection.close(); 
		
		return "centros"; 
	}
	
	@GetMapping("/contacto")
	static public String contacto(Model template) throws SQLException {
		return "contacto";
	}
	
	@PostMapping("/contacto")
	static public String recepcion(Model template, @RequestParam String mail, @RequestParam String comentario) throws SQLException {
		
		Connection connection;
		connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyecto_comit", "postgres", "admin");
		
		
		
			
				
		PreparedStatement ps = connection.prepareStatement(
				"INSERT INTO contacto(mail, comentario)"
						+ "VALUES(?,?)");
						
		ps.setString(1, mail); 
		ps.setString(2, comentario);
		
		
		if (mail.equals("") || comentario.equals(""))	{
			template.addAttribute("mail", mail); 
			template.addAttribute("comentario", comentario);
			template.addAttribute("error", "Falta completar datos");
			
			return "contacto";
		}
		
				
		ps.executeUpdate();
				
		template.addAttribute("gracias", "Gracias por contactarnos");
		
		connection.close();
		
		return "contacto";
		
	}
		
	public static int obtenerUsuario (HttpServletRequest request)throws SQLException {
		
		HttpSession session = request.getSession();
		String codigo = (String)session.getAttribute("codigo");
		if(codigo == null) { return 0; }

		Connection connection;
		connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyecto_comit", "postgres", "admin");
		
		PreparedStatement ps = connection.prepareStatement(
				  "SELECT id, usuarioc FROM usuarios WHERE codigo = ?;");
		ps.setString(1, codigo);
		ResultSet result = ps.executeQuery();
		
		if ( result.next() ) {
			return result.getInt("id"); // usa como una ruta	
		}
		return 0;
	}
	
	@GetMapping("/login")
	public static String login() {
		return "login";
	}
	
	@GetMapping("/cerrarSesion")
	public static String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("codigo", null);
		return "login";
	}
	
	@PostMapping("/login")
	public static String procesarLogin(HttpServletRequest request, Model template, 
			@RequestParam String usuarioc, 
			@RequestParam String password) throws SQLException {
		Connection connection;
		connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyecto_comit", "postgres", "admin");
		
		if (usuarioc.equals("") || password.equals("")) {
			template.addAttribute("errorUsuario", "Usuario o contrasenia vacío");
			return "login";	
		}
		
		PreparedStatement ps = connection.prepareStatement(
				  "SELECT id, usuarioc FROM usuarios WHERE usuarioc = ? AND password = ?;");
		ps.setString(1, usuarioc);
		ps.setString(2, password);
		
		ResultSet result = ps.executeQuery();
		
		
		
		if ( result.next() ) {
			String nuevoCodigo = UUID.randomUUID().toString();
			HttpSession session = request.getSession();
			session.setAttribute("codigo", nuevoCodigo);
			ps = connection.prepareStatement(
					  "UPDATE usuarios SET codigo = ? WHERE usuarioc = ? AND password = ?;");
			ps.setString(1, nuevoCodigo);
			ps.setString(2, usuarioc);
			ps.setString(3, password);
			ps.executeUpdate();
			
			return "redirect:/centrosagregar"; // usa como una ruta	
		} else {
			template.addAttribute("mensajeError", "Usuario o contrasenia no valida");
			return "login";	
		}
		
		
		
		
	}
	
	
	@GetMapping("/registro")
	public static String registro(Model template) {
		return "registro";
		
		
	}
	
	@PostMapping("/procesarRegistro")
	public static String procesarRegistro(@RequestParam String usuarioc, @RequestParam int password, Model template) throws SQLException {
		
		Connection connection;
		connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyecto_comit", "postgres", "admin");
		
		PreparedStatement ps = connection.prepareStatement(
				"SELECT * FROM usuarios WHERE (usuarioc=?)");
		ps.setString(1, usuarioc);
		
		
		ResultSet result = ps.executeQuery();
		
		if(result.next()) {
			template.addAttribute("error", "Usuario en uso. Elige otro");
			return "registro";
		}
		
		
		
		PreparedStatement ps2 = connection.prepareStatement(
				  "INSERT INTO usuarios(usuarioc, password) VALUES(?, ?);");

		
		
		ps2.setString(1, usuarioc);
		ps2.setInt(2, password);		
		
		ps2.executeUpdate();
		
		
	
		connection.close();
		
		//Redirige a la ruta /login
		return "redirect:/login";
	}
	
	
	@GetMapping("/centrosagregar")
	public static String ingresarCentros(HttpServletRequest request) throws SQLException {
		int id= obtenerUsuario(request);
		if (id==0) {
			return "redirect:/login";
		}
		return "centrosagregar";
	}
	@PostMapping("/centrosagregar")
	public static String agregarCentros(HttpServletRequest request) throws SQLException {
		int id= obtenerUsuario(request);
		if (id==0) {
			return "redirect:/login";
		}
		return "centrosagregar";
	}
}
