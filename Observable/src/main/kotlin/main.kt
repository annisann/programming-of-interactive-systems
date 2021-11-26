import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.kotlin.subscribeBy

fun main(args: Array<String>){

    val subscriptions = CompositeDisposable()

    val observableSatu = Observable.create<String> {
        it.onNext("Satu")
        it.onError(RuntimeException("Error"))
        it.onNext("Dua")
        it.onComplete()
    }

    val observableDua = Observable.create<String> {
        it.onNext("Tiga")
    }

    val subscriberSatu = observableSatu.subscribeBy(
        onNext = { println(it) },
        onComplete = { println("Selesai") },
        onError = { println(it) }
    )
    subscriptions.add(subscriberSatu)

    val subscriberDua = observableDua.subscribeBy(
        onNext = { println(it) }
    )
    subscriptions.add(subscriberDua)

    subscriptions.dispose()
}