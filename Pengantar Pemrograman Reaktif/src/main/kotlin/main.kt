import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.kotlin.subscribeBy

fun main(args: Array<String>){
    val observablePertama = Observable.just("satu", "dua", "tiga")
    val subscriberPertama = observablePertama.subscribe {
        println("Subscriber Pertama: $it")
    }
    val subscriberKedua = observablePertama.subscribe {
        println("Subscriber Kedua: $it")
    }

    val subscriberKetiga = observablePertama.subscribeBy(
        onNext = { println(it) },
        onComplete = { print("selesai") },
        onError = { println("gangguan") }
    )
}