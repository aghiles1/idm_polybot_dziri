package Polybot.polybot.aspects;

import Polybot.polybot.aspects.TakeDropObjectAspectTakeDropObjectAspectProperties;
import java.util.Map;
import polybot.TakeDropObject;

@SuppressWarnings("all")
public class TakeDropObjectAspectTakeDropObjectAspectContext {
  public final static TakeDropObjectAspectTakeDropObjectAspectContext INSTANCE = new TakeDropObjectAspectTakeDropObjectAspectContext();
  
  public static TakeDropObjectAspectTakeDropObjectAspectProperties getSelf(final TakeDropObject _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new Polybot.polybot.aspects.TakeDropObjectAspectTakeDropObjectAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<TakeDropObject, TakeDropObjectAspectTakeDropObjectAspectProperties> map = new java.util.WeakHashMap<polybot.TakeDropObject, Polybot.polybot.aspects.TakeDropObjectAspectTakeDropObjectAspectProperties>();
  
  public Map<TakeDropObject, TakeDropObjectAspectTakeDropObjectAspectProperties> getMap() {
    return map;
  }
}
