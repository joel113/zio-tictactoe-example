package com.joel.zio

import zio.{App, ExitCode, URIO, ZEnv, ZIO, console}
import zio.console.Console

object TicTacToe extends App {

  val program: ZIO[Console, Any, Unit] = console.putStrLn("TicTacToe game!")

  override def run(args: List[String]): URIO[ZEnv, ExitCode] = {
    // https://github.com/zio/zio/issues/2153
    // it was an easier method introduced to deal with exit codes at the beginning of a program as developers might
    // be unfamiliar with folding
    program.exitCode
  }
}
