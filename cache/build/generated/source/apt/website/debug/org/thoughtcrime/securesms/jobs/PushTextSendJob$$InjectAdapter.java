// Code generated by dagger-compiler.  Do not edit.
package org.thoughtcrime.securesms.jobs;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

/**
 * A {@code Binding<PushTextSendJob>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 *
 * Owning the dependency links between {@code PushTextSendJob} and its
 * dependencies.
 *
 * Being a {@code Provider<PushTextSendJob>} and handling creation and
 * preparation of object instances.
 *
 * Being a {@code MembersInjector<PushTextSendJob>} and handling injection
 * of annotated fields.
 */
public final class PushTextSendJob$$InjectAdapter extends Binding<PushTextSendJob>
    implements MembersInjector<PushTextSendJob> {
  private Binding<org.thoughtcrime.securesms.dependencies.SignalCommunicationModule.SignalMessageSenderFactory> messageSenderFactory;
  private Binding<PushSendJob> supertype;

  public PushTextSendJob$$InjectAdapter() {
    super(null, "members/org.thoughtcrime.securesms.jobs.PushTextSendJob", NOT_SINGLETON, PushTextSendJob.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    messageSenderFactory = (Binding<org.thoughtcrime.securesms.dependencies.SignalCommunicationModule.SignalMessageSenderFactory>) linker.requestBinding("org.thoughtcrime.securesms.dependencies.SignalCommunicationModule$SignalMessageSenderFactory", PushTextSendJob.class, getClass().getClassLoader());
    supertype = (Binding<PushSendJob>) linker.requestBinding("members/org.thoughtcrime.securesms.jobs.PushSendJob", PushTextSendJob.class, getClass().getClassLoader(), false, true);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(messageSenderFactory);
    injectMembersBindings.add(supertype);
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<PushTextSendJob>}.
   */
  @Override
  public void injectMembers(PushTextSendJob object) {
    object.messageSenderFactory = messageSenderFactory.get();
    supertype.injectMembers(object);
  }

}
