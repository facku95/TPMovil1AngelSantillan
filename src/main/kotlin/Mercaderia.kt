open class Mercaderia {
    val nombre:String
    val precio:Double
    val id:Int
    var cantidad:Double

    constructor(nombre: String,precio: Double,id:Int,cantidad:Double){
    this.nombre=nombre
    this.precio=precio
    this.id=id
    this.cantidad=cantidad

}
open fun mostrarDatos(): String {

    var datos="$nombre$precio"
    return datos
}
    open fun registrarventa(valor:Double){

    }
}
/////////////////
class Bebidas : Mercaderia {
    val litros:Double
    val marca:String
    val sabor:String


    constructor(nombre:String,precio: Double,id:Int,cantidad:Double,
                litros:Double,marca:String,sabor:String) : super(nombre,precio,id,cantidad) {
        this.litros=litros
        this.marca=marca
        this.sabor=sabor

    }
 override fun mostrarDatos():String{
     var datos:String="$id\t$nombre\t$marca\t$precio\t$sabor "
     return datos
 }

    override fun registrarventa(valor: Double) {
        cantidad=cantidad-valor
    }

}
/////////////////
class Galletitas:Mercaderia{
    val peso:Double
    val relleno:String
    constructor(nombre:String,precio: Double,id:Int,cantidad:Double,
                peso:Double,relleno:String):super(nombre,precio,id,cantidad){
          this.peso=peso
          this.relleno=relleno

                }
    override fun mostrarDatos():String{
        var datos:String="$id\t$nombre\t$precio\t$peso\t$relleno\t$cantidad"
        return datos
    }

    override fun registrarventa(valor: Double) {
        cantidad=cantidad-valor
    }

}
//////////////////
class frutas:Mercaderia{
    val tipo:String
    var peso:Double
    constructor(nombre:String,precio: Double,id:Int,cantidad:Double,
                tipo:String,peso:Double):super(nombre,precio,id,cantidad){
        this.tipo=tipo
        this.peso=peso

    }
    override fun mostrarDatos(): String {
        var datos:String="$id\t$tipo\t$precio\t"
        return datos
    }

     override fun registrarventa(valor: Double) {
        peso=peso-valor
    }
}