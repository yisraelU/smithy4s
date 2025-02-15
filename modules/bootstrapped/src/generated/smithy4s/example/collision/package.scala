package smithy4s.example

package object collision {
  type ReservedNameService[F[_]] = smithy4s.kinds.FunctorAlgebra[ReservedNameServiceGen, F]
  val ReservedNameService = ReservedNameServiceGen

  type MyList = smithy4s.example.collision.MyList.Type
  type MyMap = smithy4s.example.collision.MyMap.Type
  type MySet = smithy4s.example.collision.MySet.Type
  type ReservedKeywordTraitExampleCollection = smithy4s.example.collision.ReservedKeywordTraitExampleCollection.Type
  type ReservedKeywordTraitExamplePrimitive = smithy4s.example.collision.ReservedKeywordTraitExamplePrimitive.Type
  type ReservedNameUnionTrait = smithy4s.example.collision.ReservedNameUnionTrait.Type
  type String = smithy4s.example.collision.String.Type
  type TestReservedNamespaceTrait = smithy4s.example.collision.TestReservedNamespaceTrait.Type

}