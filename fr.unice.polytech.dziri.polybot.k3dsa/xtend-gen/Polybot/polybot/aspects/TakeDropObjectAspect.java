package Polybot.polybot.aspects;

import Polybot.polybot.aspects.InstructionAspect;
import Polybot.polybot.aspects.TakeDropObjectAspectTakeDropObjectAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import polybot.TakeDropObject;

/**
 * Prendre l'objet et le déposer dans la bonne place
 */
@Aspect(className = TakeDropObject.class)
@SuppressWarnings("all")
public class TakeDropObjectAspect extends InstructionAspect {
  @Step
  @OverrideAspectMethod
  public static void exec(final TakeDropObject _self) {
    final Polybot.polybot.aspects.TakeDropObjectAspectTakeDropObjectAspectProperties _self_ = Polybot.polybot.aspects.TakeDropObjectAspectTakeDropObjectAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exec()
    if (_self instanceof polybot.TakeDropObject){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			Polybot.polybot.aspects.TakeDropObjectAspect._privk3_exec(_self_, (polybot.TakeDropObject)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "TakeDropObject", "exec");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_exec(final TakeDropObjectAspectTakeDropObjectAspectProperties _self_, final TakeDropObject _self) {
    InputOutput.<String>println("TakeDropObject");
  }
}
