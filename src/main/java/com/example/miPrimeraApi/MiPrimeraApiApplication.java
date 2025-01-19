package com.example.miPrimeraApi;

import com.example.miPrimeraApi.entities.*;
import com.example.miPrimeraApi.entities.enums.*;
import com.example.miPrimeraApi.repositories.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class MiPrimeraApiApplication {/*
	@Autowired
	private ImagenRepository imagenRepository;
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private EmpleadoRepository empleadoRepository;
	public static void main(String[] args) {
		SpringApplication.run(MiPrimeraApiApplication.class, args);
		System.out.println("Servidor iniciado.");
	}
	@Bean
	@Transactional
	CommandLineRunner init(ImagenRepository imagenRepository, UsuarioRepository usuarioRepository,EmpleadoRepository empleadoRepository){
		return args ->{
			Imagen img1=Imagen.builder().denominacion("imagen1").build();
			imagenRepository.save(img1);
			Imagen img2=Imagen.builder().denominacion("imagen2").build();
			imagenRepository.save(img2);
			Usuario us1= Usuario.builder().auth0Id("pass").userName("user").build();
			usuarioRepository.save(us1);
			Empleado em1=Empleado.builder().rol(Rol.CAJERO).build();
			em1.setNombre("Milagros");
			em1.setApellido("Ranaldi");
			em1.setTelefono("2617601936");
			em1.setEmail("ranaldi510@gmail.com");
			em1.setFechaNacimiento("2002-09-26");
			em1.setImagenPersona(img1);
			em1.setUsuario(us1);
			empleadoRepository.save(em1);


		};
	}*/

		@Autowired
		private ImagenRepository imagenRepository;
		@Autowired
		private UsuarioRepository usuarioRepository;
		@Autowired
		private EmpleadoRepository empleadoRepository;
		@Autowired
		private ClienteRepository clienteRepository;
		@Autowired
		private PaisRepository paisRepository;
		@Autowired
		private ProvinciaRepository provinciaRepository;
		@Autowired
		private LocalidadRepository localidadRepository;
		@Autowired
		private DomicilioRepository domicilioRepository;
		@Autowired
		private EmpresaRepository empresaRepository;
		@Autowired
		private SucursalRepository sucursalRepository;
		@Autowired
		private PedidoRepository pedidoRepository;
		@Autowired
		private DetallePedidoRepository detallePedidoRepository;
		@Autowired
		private CategoriaRepository categoriaRepository;
		@Autowired
		private PromocionRepository promocionRepository;
		@Autowired
		private UnidadMedidaRepository unidadMedidaRepository;
		@Autowired
		private ArticuloInsumoRepository articuloInsumoRepository;
		@Autowired
		private ArticuloManufacturadoRepository articuloManufacturadoRepository;
		@Autowired
		private ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository;
		@Autowired
		private PromocionDetalleRepository promocionDetalleRepository;
		@Autowired
		private FacturaRepository facturaRepository;

		public static void main(String[] args) {
			SpringApplication.run(com.example.miPrimeraApi.MiPrimeraApiApplication.class, args);
			System.out.println("Servidor iniciado.");
		}

		@Bean
		@Transactional
		CommandLineRunner init(ImagenRepository imagenRepository,
							   UsuarioRepository usuarioRepository,
							   EmpleadoRepository empleadoRepository,
							   ClienteRepository clienteRepository,
							   PaisRepository paisRepository,
							   ProvinciaRepository provinciaRepository,
							   LocalidadRepository localidadRepository,
							   DomicilioRepository domicilioRepository,
							   EmpresaRepository empresaRepository,
							   SucursalRepository sucursalRepository,
							   PedidoRepository pedidoRepository,
							   DetallePedidoRepository detallePedidoRepository,
							   CategoriaRepository categoriaRepository,
							   PromocionRepository promocionRepository,
							   UnidadMedidaRepository unidadMedidaRepository,
							   ArticuloInsumoRepository articuloInsumoRepository,
							   ArticuloManufacturadoRepository articuloManufacturadoRepository,
							   ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository,
							   PromocionDetalleRepository promocionDetalleRepository,
							   FacturaRepository facturaRepository){
			return args -> {

				Pais pais1 = Pais.builder()
						.nombre("Pais 1")
						.build();
				paisRepository.save(pais1);

				Provincia prov1 = Provincia.builder()
						.nombre("Provincia 1")
						.pais(pais1)
						.build();
				provinciaRepository.save(prov1);

				Localidad loc1 = Localidad.builder()
						.nombre("Localidad 1")
						.provincia(prov1)
						.build();
				localidadRepository.save(loc1);

				Domicilio dom1 = Domicilio.builder()
						.calle("Calle 1")
						.numero(1234)
						.cp(1234)
						.localidad(loc1)
						.build();
				domicilioRepository.save(dom1);
				Domicilio dom2 = Domicilio.builder()
						.calle("Calle 2")
						.numero(5678)
						.cp(5678)
						.localidad(loc1)
						.build();
				domicilioRepository.save(dom2);

				Empresa empr1 = Empresa.builder()
						.razonSocial("Empresa S.A")
						.nombre("Empresa 1")
						.cuil(12334555)
						.build();
				empresaRepository.save(empr1);

				Sucursal suc1 = Sucursal.builder()
						.nombre("Sucursal 1")
						.casaMatriz(Boolean.FALSE)
						.domicilio(dom1)
						.horarioApertura(LocalTime.of(8,30))
						.horarioCierre(LocalTime.of(20,30))
						.empresa(empr1)
						.build();
				sucursalRepository.save(suc1);

				Imagen img1 = Imagen.builder()
						.denominacion("Imangen 1")
						.build();
				imagenRepository.save(img1);
				Imagen img2 = Imagen.builder()
						.denominacion("Imangen 2")
						.build();
				imagenRepository.save(img2);
				Imagen img3 = Imagen.builder()
						.denominacion("Imangen 3")
						.build();
				imagenRepository.save(img3);


				Usuario us1 = Usuario.builder()
						.auth0Id("pass")
						.userName("user")
						.build();
				usuarioRepository.save(us1);
				Usuario us2 = Usuario.builder()
						.auth0Id("pass2")
						.userName("user2")
						.build();
				usuarioRepository.save(us2);
				Usuario us3 = Usuario.builder()
						.auth0Id("pass3")
						.userName("user3")
						.build();
				usuarioRepository.save(us3);

				Empleado em1 = Empleado.builder()
						.sucursal(suc1)
						.build();
				em1.setNombre("Cinthia");
				em1.setApellido("Rigoni");
				em1.setTelefono("123456");
				em1.setEmail("prueba@gmail.com");
				em1.setFechaNacimiento("1992-05-27");
				em1.setImagenPersona(img1);
				em1.setUsuario(us1);
				em1.setRol(Rol.CAJERO);
				empleadoRepository.save(em1);


				Cliente cli1 = Cliente.builder().build();
				cli1.setNombre("Juan");
				cli1.setApellido("Fernandez");
				cli1.setTelefono("456789");
				cli1.setEmail("probando@gmail.com");
				cli1.setFechaNacimiento("1996-01-31");
				cli1.setImagenPersona(img2);
				cli1.setUsuario(us2);
				cli1.setRol(Rol.CLIENTE);

				clienteRepository.save(cli1);
				Cliente cli2 = Cliente.builder().build();
				cli2.setNombre("Manuel");
				cli2.setApellido("Gomez");
				cli2.setTelefono("2617601936");
				cli2.setEmail("nnnnnnnn@gmail.com");
				cli2.setFechaNacimiento("2000-03-26");
				cli2.setImagenPersona(img3);
				cli2.setUsuario(us3);
				cli2.setRol(Rol.CLIENTE);
				clienteRepository.save(cli2);
				Set<Cliente> clientes=new HashSet<>();
				clientes.add(cli1);
				clientes.add(cli2);
				dom1.setClientes(clientes);
				domicilioRepository.save(dom1);


				Pedido ped1 = Pedido.builder()
						.fechaPedido(LocalDate.of(2023,05,23))
						.sucursal(suc1)
						.cliente(cli1)
						.empleado(em1)
						.total(0.0)
						.estado(Estado.PENDIENTE)
						.formaPago(FormaPago.EFECTIVO)
						.horaEstimadaFinalizacion(LocalTime.of(12,55))
						.tipoEnvio(TipoEnvio.DELIVERY)
						.totalCosto(170.0)
						.build();
				ped1.setDomicilio(dom2);
				pedidoRepository.save(ped1);

				DetallePedido detPed1 = DetallePedido.builder()
						.pedido(ped1)
						.cantidad(5)
						.subtotal(450.5)
						.build();
				detallePedidoRepository.save(detPed1);

				DetallePedido detPed2 = DetallePedido.builder()
						.pedido(ped1)
						.cantidad(2)
						.subtotal(300.0)
						.build();
				detallePedidoRepository.save(detPed2);


				Categoria cat1 = Categoria.builder()
						.denominacion("Categoria 1")
						.build();
				categoriaRepository.save(cat1);

				Categoria subCat1 = Categoria.builder()
						.denominacion("Subcategoria 1")
						.categoriaPadre(cat1)
						.build();
				categoriaRepository.save(subCat1);

				Categoria subCat2 = Categoria.builder()
						.denominacion("Subcategoria 2")
						.categoriaPadre(cat1)
						.build();
				categoriaRepository.save(subCat2);
				Set<Sucursal> sucursales=new HashSet<>();
				sucursales.add(suc1);

				cat1.getSubcategorias().add(subCat1);
				cat1.getSubcategorias().add(subCat2);
				cat1.setSucursales(sucursales);
				categoriaRepository.save(cat1);


				//sucursalRepository.save(suc1);
				Imagen imgarticulo1 = Imagen.builder()
						.denominacion("Img articulo 1")
						.build();
				imagenRepository.save(imgarticulo1);


				Imagen imgarticulo2 = Imagen.builder()
						.denominacion("Img articulo 2")
						.build();
				imagenRepository.save(imgarticulo2);


				Imagen imgProm1 = Imagen.builder()
						.denominacion("Imagen promo 1")
						.build();

				imagenRepository.save(imgProm1);
				Imagen imgProm2 = Imagen.builder()
						.denominacion("Imagen promo 2")
						.build();
				imagenRepository.save(imgProm2);

				Promocion prom1 = Promocion.builder()
						.denominacion("Promocion 1")
						.descripcionDescuento("10% de descuento")
						.fechaDesde(LocalDate.of(2024,06,12))
						.fechaHasta(LocalDate.of(2024, 06, 25))
						.horaDesde(LocalTime.of(20,30))
						.horaHasta(LocalTime.of(23,30))
						.precioPromocional(2500.5)
						.tipoPromocion(TipoPromocion.HAPPYHOUR)
						.build();
				prom1.getImagenesPromociones().add(imgProm1);
				promocionRepository.save(prom1);
				Promocion prom2 = Promocion.builder()
						.denominacion("Promocion 2")
						.descripcionDescuento("15% de descuento")
						.fechaDesde(LocalDate.of(2024,06,12))
						.fechaHasta(LocalDate.of(2024, 06, 25))
						.horaDesde(LocalTime.of(11,30))
						.horaHasta(LocalTime.of(14,30))
						.precioPromocional(3000.0)
						.tipoPromocion(TipoPromocion.HAPPYHOUR)
						.build();
				prom2.getImagenesPromociones().add(imgProm2);
				promocionRepository.save(prom2);
				Set<Sucursal>sucursales1=new HashSet<>();
				sucursales1.add(suc1);
				prom1.setSucursales(sucursales1);
				prom2.setSucursales(sucursales1);
				promocionRepository.save(prom1);
				promocionRepository.save(prom2);
				UnidadMedida unMedida = UnidadMedida.builder()
						.denominacion("Unidad de medida 1")
						.build();
				unidadMedidaRepository.save(unMedida);

				ArticuloInsumo artInsumo1 = ArticuloInsumo.builder()
						.denominacion("Articulo insumo 1")
						.precioVenta(230.0)
						.precioCompra(460.5)
						.stockActual(36)
						.stockMaximo(150)
						.esParaElaborar(Boolean.TRUE)
						.categoria(cat1)
						.unidadMedida(unMedida)
						.build();
				detPed2.setArticulo(artInsumo1);
				artInsumo1.getImagenesArticulos().add(imgarticulo1);
				articuloInsumoRepository.save(artInsumo1);

				ArticuloManufacturado artManuf1 = ArticuloManufacturado.builder()
						.denominacion("Articulo Manufacturado 1")
						.categoria(cat1)
						.precioVenta(140.5)
						.descripcion("Descripcion art manuf 1")
						.tiempoEstimadoMinutos(60)
						.preparacion("Preparacion art manuf 1")
						.unidadMedida(unMedida)
						.build();
				detPed1.setArticulo(artManuf1);
				ped1.setDomicilio(dom2);
				artManuf1.getImagenesArticulos().add(imgarticulo2);
				articuloManufacturadoRepository.save(artManuf1);
				ArticuloManufacturadoDetalle artManufDet1 = ArticuloManufacturadoDetalle.builder()
						.cantidad(2)
						.articuloInsumo(artInsumo1)
						.articuloManufacturado(artManuf1)
						.build();
				articuloManufacturadoDetalleRepository.save(artManufDet1);

				detPed1.setArticulo(artInsumo1);
				detallePedidoRepository.save(detPed1);
				detPed2.setArticulo(artManuf1);
				detallePedidoRepository.save(detPed2);
				PromocionDetalle promDetalle1 = PromocionDetalle.builder()
						.cantidad(2)
						.articulo(artManuf1)
						.promocion(prom1)
						.build();
				promocionDetalleRepository.save(promDetalle1);

				Factura factura1 = Factura.builder()
						.pedido(ped1)
						.formaPago(FormaPago.EFECTIVO)
						.fechaFacturacion(LocalDate.of(2024,06,10))
						.total_venta(ped1.getTotal())
						.build();
				factura1.setPedido(ped1);
				factura1.getPedido();
				facturaRepository.save(factura1);
				ped1.setFactura(factura1);
				pedidoRepository.save(ped1);



			};
		}

	}



