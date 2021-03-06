package laserdisc

object connection  extends protocol.ConnectionP
object hashmaps    extends protocol.AllHashP
object hyperloglog extends protocol.AllHyperLogLogP
object keys        extends protocol.AllKeyP
object lists       extends protocol.AllListP { object blocking extends protocol.AllBListP }
object publish     extends protocol.PublishP
object server      extends protocol.ServerP
object sets        extends protocol.AllSetP
object sortedsets  extends protocol.AllSortedSetP
object strings     extends protocol.AllStringP

object all
    extends protocol.ConnectionP
    with protocol.AllHashP
    with protocol.AllHyperLogLogP
    with protocol.AllKeyP
    with protocol.AllListP
    with protocol.PublishP
    with protocol.ServerP
    with protocol.AllSetP
    with protocol.AllSortedSetP
    with protocol.AllStringP {
  final object blocking extends protocol.AllBListP
}
