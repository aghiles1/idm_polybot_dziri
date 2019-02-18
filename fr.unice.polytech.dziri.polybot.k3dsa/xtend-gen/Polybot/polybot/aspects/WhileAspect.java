package Polybot.polybot.aspects;

import Polybot.polybot.aspects.InstructionAspect;
import Polybot.polybot.aspects.WhileAspectWhileAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import polybot.Instruction;
import polybot.While;

/**
 * nb fois les instructions
 */
@Aspect(className = While.class)
@SuppressWarnings("all")
public class WhileAspect extends InstructionAspect {
  @Step
  @OverrideAspectMethod
  public static void exec(final While _self) {
    final Polybot.polybot.aspects.WhileAspectWhileAspectProperties _self_ = Polybot.polybot.aspects.WhileAspectWhileAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exec()
    if (_self instanceof polybot.While){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			Polybot.polybot.aspects.WhileAspect._privk3_exec(_self_, (polybot.While)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "While", "exec");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_exec(final WhileAspectWhileAspectProperties _self_, final While _self) {
    int i = _self.getNb();
    while ((i > 0)) {
      {
        EList<Instruction> _listOfInstructions = _self.getListOfInstructions();
        for (final Instruction instr : _listOfInstructions) {
          InstructionAspect.exec(instr);
        }
        i = (i - 1);
      }
    }
  }
}
