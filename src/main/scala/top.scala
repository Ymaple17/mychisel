import chisel3._
import chisel3.util._
import _root_.circt.stage.ChiselStage






object TopMain extends App {
  ChiselStage.emitSystemVerilogFile(
    new Top,
    firtoolOpts = Array("-disable-all-randomization", "-strip-debug-info", "-default-layer-specialization=enable")
  )
}
