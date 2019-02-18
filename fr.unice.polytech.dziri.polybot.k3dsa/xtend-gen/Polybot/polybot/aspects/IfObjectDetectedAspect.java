package Polybot.polybot.aspects;

import Polybot.polybot.aspects.IfObjectDetectedAspectIfObjectDetectedAspectProperties;
import Polybot.polybot.aspects.InstructionAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import polybot.IfObjectDetected;

/**
 * SI on trouve l'objet on va vers lui
 */
@Aspect(className = IfObjectDetected.class)
@SuppressWarnings("all")
public class IfObjectDetectedAspect extends InstructionAspect {
  @Step
  @OverrideAspectMethod
  public static void exec(final IfObjectDetected _self) {
    final Polybot.polybot.aspects.IfObjectDetectedAspectIfObjectDetectedAspectProperties _self_ = Polybot.polybot.aspects.IfObjectDetectedAspectIfObjectDetectedAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exec()
    if (_self instanceof polybot.IfObjectDetected){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			Polybot.polybot.aspects.IfObjectDetectedAspect._privk3_exec(_self_, (polybot.IfObjectDetected)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "IfObjectDetected", "exec");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_exec(final IfObjectDetectedAspectIfObjectDetectedAspectProperties _self_, final IfObjectDetected _self) {
    InputOutput.<String>println("IfObjectDetected");
  }
}
