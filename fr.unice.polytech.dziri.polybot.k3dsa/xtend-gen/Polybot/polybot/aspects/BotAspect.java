package Polybot.polybot.aspects;

import Polybot.polybot.aspects.BotAspectBotAspectProperties;
import Polybot.polybot.aspects.InstructionAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.unice.polytech.deantoni.vrep.polybot.PolyBrain;
import org.eclipse.emf.common.util.EList;
import polybot.Bot;
import polybot.Instruction;

@Aspect(className = Bot.class)
@SuppressWarnings("all")
public class BotAspect {
  public static PolyBrain rob;
  
  @Main
  public static void execute(final Bot _self) {
    final Polybot.polybot.aspects.BotAspectBotAspectProperties _self_ = Polybot.polybot.aspects.BotAspectBotAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof polybot.Bot){
    	Polybot.polybot.aspects.BotAspect._privk3_execute(_self_, (polybot.Bot)_self);
    };
  }
  
  protected static void _privk3_execute(final BotAspectBotAspectProperties _self_, final Bot _self) {
    PolyBrain _polyBrain = new PolyBrain("127.0.0.1", 19997);
    BotAspect.rob = _polyBrain;
    BotAspect.rob.start();
    BotAspect.rob.synchronous();
    EList<Instruction> _instructionList = _self.getInstructionList();
    for (final Instruction instr : _instructionList) {
      InstructionAspect.exec(instr);
    }
  }
}
