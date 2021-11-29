import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.kotlin.subscribeBy
import io.reactivex.rxjava3.subjects.AsyncSubject
import io.reactivex.rxjava3.subjects.BehaviorSubject
import io.reactivex.rxjava3.subjects.PublishSubject
import io.reactivex.rxjava3.subjects.ReplaySubject

fun main(args: Array<String>){

    /** Publish Subject **/
//    val subscriptions = CompositeDisposable()
//    val subject = PublishSubject.create<String>()
//
//    subject.onNext("Satu")
//    subject.onNext("Dua")
//    subject.onNext("Tiga")
//
//    val subscriberSatu = subject.subscribeBy(
//        onNext = { println("S1: $it") }
//    )
//    subscriptions.add(subscriberSatu)
//
//    subject.onNext("Empat")
//
//    val subscriberDua = subject.subscribeBy(
//        onNext = { println("S2: $it") }
//    )
//    subscriptions.add(subscriberDua)
//
//    subscriptions.dispose()

    /** Behavior Subject **/
//    val subscriptions = CompositeDisposable()
//    val subject = BehaviorSubject.create<String>()
//
//    subject.onNext("Satu")
//    subject.onNext("Dua")
//    subject.onNext("Tiga")
//
//    val subscriberSatu = subject.subscribeBy(
//        onNext = { println("S1: $it") }
//    )
//    subscriptions.add(subscriberSatu)
//
//    subject.onNext("Empat")
//
//    val subscriberDua = subject.subscribeBy(
//        onNext = { println("S2: $it") }
//    )
//    subscriptions.add(subscriberDua)
//
//    subscriptions.dispose()

    /** Replay Subject **/
//    val subscriptions = CompositeDisposable()
//    val subject = ReplaySubject.createWithSize<String>(4)
//
//    subject.onNext("Satu")
//    subject.onNext("Dua")
//    subject.onNext("Tiga")
//
//    val subscriberSatu = subject.subscribeBy(
//        onNext = { println("S1: $it") }
//    )
//    subscriptions.add(subscriberSatu)
//
//    subject.onNext("Empat")
//
//    val subscriberDua = subject.subscribeBy(
//        onNext = { println("S2: $it") }
//    )
//    subscriptions.add(subscriberDua)
//
//    subscriptions.dispose()

    /** Async Subject **/
    val subscriptions = CompositeDisposable()
    val subject = AsyncSubject.create<String>()

    subject.onNext("Satu")
    subject.onNext("Dua")
    subject.onNext("Tiga")

    val subscriberSatu = subject.subscribeBy(
        onNext = { println("S1: $it") }
    )
    subscriptions.add(subscriberSatu)

    subject.onNext("Empat")

    val subscriberDua = subject.subscribeBy(
        onNext = { println("S2: $it") }
    )
    subscriptions.add(subscriberDua)

    subject.onComplete()

    subscriptions.dispose()
}