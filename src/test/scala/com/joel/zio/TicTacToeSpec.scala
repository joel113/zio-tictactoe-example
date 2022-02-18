package com.joel.zio

import zio.test.Assertion.equalTo
import zio.test.DefaultRunnableSpec
import zio.test.environment.TestConsole

object TicTacToeSpec extends DefaultRunnableSpec {
  suite("TicTacToe")(
    testM("prints to console") {
      for {
        test <- TestConsole.feedLines("Tic", "Tac", "Toe")
        _ <- TicTacToe.program.provide(new TestConsole {
          val console = test
        })
        out <- TestConsole.output
      } yield assert(out, equalTo(Vector("TicTacToe game!\n")))
    }
  )
}
