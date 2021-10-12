import java.util.*

fun main (args: Array<String>){
    val scanner  = Scanner(System.`in`)
    var nombre:String
    var precio:Double
    var litros:Double
    var marca:String
    var sabor:String
    var peso:Double
    var relleno:String
    var cantidad:Double
    var tipo:String
    var pesototal:Double
    var id:Int
    var recaudacion:Double= 0.0

    var lista1 : MutableList<Mercaderia> = mutableListOf()


    var i=1
    while (i!=0) {

        println("///////Menu de supermercado/////// \n")
        println("1- Registro de productos")
        println("2- Registro de ventas")
        println("3- Mostrar recaudacion")
        i=scanner.nextInt()
        when(i) {
            1 -> {
                var j = 1
                while (j != 0) {
                    println("REGISTRO DE PRODUCTOS\n")
                    println("1- Registrar nuevo producto")
                    println("2- Mostrar listado de productos")
                    println("3- Mostrar informacion de un producto")
                    j = scanner.nextInt()
                    when (j) {
                        1 -> {
                            var k = 1
                            while (k != 0) {
                                println("Ingrese producto a registrar")
                                println("1- Galletitas")
                                println("2- Bebidas")
                                println("3- Frutas")
                                k = scanner.nextInt()
                                when (k) {
                                    1 -> {
                                        println("Ingrese nombre: ")
                                        nombre = scanner.next()
                                        println("Ingrese precio: ")
                                        precio = scanner.nextDouble()
                                        println("Ingrese codigo de producto: ")
                                        id = scanner.nextInt()
                                        println("Ingrese peso: ")
                                        peso = scanner.nextDouble()
                                        println("Ingrese relleno: ")
                                        relleno = scanner.next()
                                        println("Ingrese cantidad de stock: ")
                                        cantidad = scanner.nextDouble()
                                        var galletitas = Galletitas(nombre, precio, id,cantidad, peso, relleno)
                                        lista1.add(galletitas)
                                    }
                                    2 -> {
                                        println("Ingrese nombre: ")
                                        nombre = scanner.next()
                                        println("Ingrese precio: ")
                                        precio = scanner.nextDouble()
                                        println("Ingrese codigo de producto: ")
                                        id = scanner.nextInt()
                                        println("Ingrese litros: ")
                                        litros = scanner.nextDouble()
                                        println("Ingrese Marca: ")
                                        marca = scanner.next()
                                        println("Ingrese sabor: ")
                                        sabor = scanner.next()
                                        println("Ingrese cantidad :")
                                        cantidad = scanner.nextDouble()
                                        var bebidas = Bebidas(nombre, precio, id, litros, cantidad,marca, sabor)
                                        lista1.add(bebidas)
                                    }
                                    3 -> {
                                        println("Ingrese fruta: ")
                                        tipo = scanner.next()
                                        println("Ingrese precio: ")
                                        precio = scanner.nextDouble()
                                        println("Ingrese codigo de producto: ")
                                        id = scanner.nextInt()
                                        println("Ingrese peso: ")
                                        peso = scanner.nextDouble()
                                        println("Ingrese cantidad: ")
                                        cantidad=scanner.nextDouble()
                                        var fruta = frutas(tipo, precio, id, cantidad, tipo,peso)
                                        lista1.add(fruta)


                                    }
                                    else -> k = 0
                                }
                            }
                        }
                        2 -> {
                            println("listado....")
                            for (h in 0..lista1.size - 1) {
                                println(lista1[h].mostrarDatos())
                            }
                        }
                        3 -> {
                            println("Ingrese ID de producto a mostrar")
                            var id: Int = scanner.nextInt()
                            for (i in 0..lista1.size - 1) {
                                if (lista1[i].id == id) {
                                    println("/////DATOS/////")
                                    println(lista1[i].mostrarDatos())
                                } else println("No se encontro producto con ese ID")
                            }
                        }
                        else -> j = 0
                    }
                }
            }
            2 -> { println("/////REGISTRAR VENTA///// \n")
                 println("Ingrese id de producto vendido")
                var id=scanner.nextInt()
                 for (i in 0..lista1.size - 1) {
                     if (lista1[i].id==id){
                         println("Cuantas unidades se vendio?:")
                         var unidades:Double=scanner.nextDouble()
                         lista1[i].registrarventa(unidades)
                         recaudacion=recaudacion+lista1[1].precio
                     }else {
                         println("no existe producto o ID erroneo")}
                        }
                     }
            3-> println()

        }

    }

    }




